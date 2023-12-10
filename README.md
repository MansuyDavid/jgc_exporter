# jgc_exporter
[![Build Status][maven-build-image]][maven-build-url]
[![CodeCov][codecov-image]][codecov-url]

An exporter that can continuously analyze hotspot garbage collection log and automatically detect Garbage collection algorithms. The basic ability relies on the [gctoolkit](https://github.com/microsoft/gctoolkit) library, which supports most mainstream garbage collections, such as CMS, G1, ZGC, etc.
# Running the exporter
JDK require: 11+

OS require: linux

Run the exporter as standalone HTTP server:
```shell
java -jar jgc_exporter.jar /path/to/config.yml
```

A simple `config.yml` looks like below:
```yaml
fileRegexPattern: /path/to/gc.*.log
```

Fetch the metrics:
```agsl
http://0.0.0.0:5898/metrics
```

# Configuration
| Name             | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| hostPort         | Host and port that http server binds, default is 0.0.0.0:5898               |
| fileRegexPattern | Regex pattern of gc log file path                                           |
| idleTimeout      | Time (ms) to close idle files, default is 10 minutes(600,000ms)             |
| batchSize        | Maximum number of lines per log read, default is 1024                       |   

# Metric
| Name                             | type    | labels         | Description                 |
|----------------------------------|---------|----------------|-----------------------------|
| jgc_log_lines_total              | counter | path           | Number of process log lines |
| jgc_event_duration_seconds       | summary | path, category | Duration of GC events       |
| jgc_event_pause_duration_seconds | summary | path, category | Duration of GC pause events |

See more [metrics](https://github.com/loyispa/jgc_exporter/blob/main/src/main/java/prometheus/exporter/jgc/collector/parser/Metrics.java) related to specific garbage-collection algorithms.

# Build
```
./mvnw clean package
```

# Native build (experimental)
The exporter can be converted into native executables by installing [graalvm](https://www.graalvm.org/downloads/).
```
./mvnw -Pnative clean package
```

# Contributing
All contributions are welcome, docs, bugfixes or features.

[maven-build-image]: https://github.com/loyispa/jgc_exporter/workflows/Java%20CI%20with%20Maven/badge.svg
[maven-build-url]: https://github.com/loyispa/jgc_exporter/actions/workflows/maven.yaml
[codecov-image]: https://codecov.io/gh/loyispa/jgc_exporter/branch/main/graph/badge.svg
[codecov-url]: https://app.codecov.io/gh/loyispa/jgc_exporter

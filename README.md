# jgc_exporter

JGC_exporter is a exporter that can continuous analysis hotspot jvm garbage collection log files, and automatically detect garbage collectors. The ability of parsing depends on the [gctoolkit](https://github.com/microsoft/gctoolkit), supports most mainstream garbage collections, such as ParNew、CMS、G1、ZGC, etc.

# Running the exporter

Run the exporter as standalone HTTP server:
```shell
java -jar jgc_exporter.jar /path/to/config.yaml
```

A simple `config.yaml` looks like below:
```yaml
hostPort: 127.0.0.1:5898
fileRegexPattern: /path/to/serviceA/gc.*.log,/path/to/serviceB/gc.*.log
```

# Contributing
All external contributions are welcome, docs, bugfixes and features. 

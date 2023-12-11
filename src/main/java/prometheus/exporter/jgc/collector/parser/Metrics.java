/*
 * Copyright (C) 2023 The  jgc_exporter Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package prometheus.exporter.jgc.collector.parser;

import io.prometheus.client.*;
import prometheus.exporter.jgc.collector.CleanableCollectorRegistry;

public class Metrics {
    public static final Counter GC_LOG_LINES =
            Counter.build()
                    .labelNames("path")
                    .name("jgc_log_lines")
                    .help("Number of process log lines")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GC_EVENT_DURATION =
            Summary.build()
                    .labelNames("path", "category")
                    .name("jgc_event_duration_seconds")
                    .help("Duration of gc event")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GC_EVENT_PAUSE_DURATION =
            Summary.build()
                    .labelNames("path", "category")
                    .name("jgc_event_pause_duration_seconds")
                    .help("Duration of gc pause event")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary USER_CPU_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_user_cpu_seconds")
                    .help("user cpu time")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary SYS_CPU_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_sys_cpu_seconds")
                    .help("sys cpu time")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary REAL_CPU_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_real_cpu_seconds")
                    .help("real cpu time")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_YOUNG_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_young_occupancy_before_collection_bytes")
                    .help("young generation occupancy before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_YOUNG_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_young_size_before_collection_bytes")
                    .help("young generation size before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_YOUNG_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_young_occupancy_after_collection_bytes")
                    .help("young generation occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_YOUNG_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_young_size_after_collection_bytes")
                    .help("young generation size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_TENURED_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_tenured_occupancy_before_collection_bytes")
                    .help("tenured generation occupancy before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_TENURED_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_tenured_size_before_collection_bytes")
                    .help("tenured generation size before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_TENURED_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_tenured_occupancy_after_collection_bytes")
                    .help("tenured generation occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_TENURED_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_tenured_size_after_collection_bytes")
                    .help("tenured generation size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_HEAP_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_heap_occupancy_before_collection_bytes")
                    .help("heap occupancy before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_HEAP_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_heap_size_before_collection_bytes")
                    .help("heap size before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_HEAP_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_heap_occupancy_after_collection_bytes")
                    .help("heap occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_HEAP_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_heap_size_after_collection_bytes")
                    .help("heap size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_CLASSSPACE_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_classspace_occupancy_before_collection_bytes")
                    .help("class space occupancy before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_CLASSSPACE_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_classspace_size_before_collection_bytes")
                    .help("class space size before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_CLASSSPACE_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_classspace_occupancy_after_collection_bytes")
                    .help("class space occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_CLASSSPACE_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_classspace_size_after_collection_bytes")
                    .help("class space size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_NONCLASSSPACE_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_nonclassspace_occupancy_before_collection_bytes")
                    .help("non-class space occupancy before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_NONCLASSSPACE_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_nonclassspace_size_before_collection_bytes")
                    .help("non-class space size before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_NONCLASSSPACE_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_nonclassspace_occupancy_after_collection_bytes")
                    .help("non-class space occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_NONCLASSSPACE_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_nonclassspace_size_after_collection_bytes")
                    .help("non-class space size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_METASPACE_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_metaspace_occupancy_before_collection_bytes")
                    .help("metaspace occupancy before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_METASPACE_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_metaspace_size_before_collection_bytes")
                    .help("metaspace size before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_METASPACE_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_metaspace_occupancy_after_collection_bytes")
                    .help("metaspace occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_METASPACE_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_metaspace_size_after_collection_bytes")
                    .help("metaspace size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_CLASS_UNLOADING_PROCESS_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_class_unloading_process_duration_seconds")
                    .help("class unloading process time")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_SYMBOL_TABLE_PROCESS_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_symbol_table_process_duration_seconds")
                    .help("symbol table process time")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_STRING_TABLE_PROCESS_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_string_table_process_duration_seconds")
                    .help("string table process duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_SYMBOL_AND_STRING_TABLE_PROCESS_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_symbol_and_string_table_process_seconds")
                    .help("symbol and string table process duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_SOFT_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_soft_references")
                    .help("amount of soft references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_SOFT_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_soft_reference_pause_duration_seconds")
                    .help("soft reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_WEAK_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_weak_references")
                    .help("amount of weak references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_WEAK_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_weak_reference_pause_seconds")
                    .help("weak reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_FINAL_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_final_references")
                    .help("amount of final references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_FINAL_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_final_reference_pause_duration_seconds")
                    .help("final reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_PHANTOM_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_phantom_references")
                    .help("amount of phantom references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_PHANTOM_REFERENCE_FREE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_free_phantom_references")
                    .help("amount of free phantom references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_PHANTOM_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_phantom_reference_pause_duration_seconds")
                    .help("phantom reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge GENERATIONAL_JNI_WEAK_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_generational_jni_weak_references")
                    .help("amount of jni weak references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary GENERATIONAL_JNI_WEAK_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_generational_jni_weak_reference_pause_duration_seconds")
                    .help("jni weak reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_HEAP_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_heap_occupancy_before_collection_bytes")
                    .help("heap occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_HEAP_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_heap_size_before_collection_bytes")
                    .help("heap size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_HEAP_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_heap_occupancy_after_collection_bytes")
                    .help("heap occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_HEAP_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_heap_size_after_collection_bytes")
                    .help("heap size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_EDEN_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_eden_occupancy_after_collection_bytes")
                    .help("eden occupancy bytes after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_EDEN_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_eden_heap_occupancy_before_collection_bytes")
                    .help("eden heap occupancy bytes before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_EDEN_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_eden_size_after_collection_bytes")
                    .help("eden size after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_EDEN_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_eden_size_before_collection_bytes")
                    .help("eden size before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);
    public static final Gauge G1_SURVIVOR_HEAP_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_survivor_heap_occupancy_after_collection_bytes")
                    .help("survivor heap occupancy bytes after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_SURVIVOR_HEAP_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_survivor_heap_occupancy_before_collection_bytes")
                    .help("survivor heap occupancy bytes before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_SURVIVOR_SIZE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_survivor_size_bytes")
                    .help("survivor size")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_META_SPACE_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_meta_space_occupancy_after_collection_bytes")
                    .help("meta space occupancy bytes after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_META_SPACE_OCCUPANCY_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_metaspace_heap_occupancy_before_collection_bytes")
                    .help("metaspace occupancy bytes before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_META_SPACE_SIZE_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_metaspace_size_after_collection_bytes")
                    .help("metaspace size bytes after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_META_SPACE_SIZE_BEFORE_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_metaspace_size_before_collection_bytes")
                    .help("metaspace size bytes before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_SOFT_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_soft_references")
                    .help("amount of g1 soft references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary G1_SOFT_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_g1_soft_reference_pause_duration_seconds")
                    .help("soft reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_WEAK_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_weak_references")
                    .help("amount of g1 weak references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary G1_WEAK_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_g1_weak_reference_pause_duration_seconds")
                    .help("weak reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_FINAL_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_final_references")
                    .help("amount of g1 final references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary G1_FINAL_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_g1_final_reference_pause_duration_seconds")
                    .help("final reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_PHANTOM_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_phantom_references")
                    .help("amount of g1 phantom references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_PHANTOM_REFERENCE_FREE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_phantom_free_references")
                    .help("amount of g1 phantom free references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary G1_PHANTOM_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_g1_phantom_reference_pause_duration_seconds")
                    .help("phantom reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_JNI_WEAK_REFERENCE_COUNT =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_jni_weak_references")
                    .help("amount of g1 jni references")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary G1_JNI_WEAK_REFERENCE_PAUSE_TIME =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_g1_jni_weak_reference_pause_duration_seconds")
                    .help("jni weak reference pause duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_EDEN_REGION_BEFORE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_eden_before_collection_regions")
                    .help("amount of g1 eden region before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_EDEN_REGION_AFTER =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_eden_after_collection_regions")
                    .help("amount of g1 eden region after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_EDEN_REGION_ASSIGN =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_eden_assign_regions")
                    .help("amount of g1 eden assign regions")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_SURVIVOR_REGION_BEFORE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_survivor_before_collection_regions")
                    .help("amount of g1 survivor region before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_SURVIVOR_REGION_AFTER =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_survivor_after_collection_regions")
                    .help("amount of g1 survivor region after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_SURVIVOR_REGION_ASSIGN =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_survivor_assign_regions")
                    .help("amount of g1 survivor assign regions")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_OLD_REGION_BEFORE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_old_before_collection_regions")
                    .help("amount of g1 old regions before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_OLD_REGION_AFTER =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_old_after_collection_regions")
                    .help("amount of g1 old regions after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_OLD_REGION_ASSIGN =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_old_assign_regions")
                    .help("amount of g1 old assign regions")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_HUMONGOUS_REGION_BEFORE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_humongous_before_collection_regions")
                    .help("amount of g1 humongous regions before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_HUMONGOUS_REGION_AFTER =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_humongous_after_collection_regions")
                    .help("amount of g1 humongous regions after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_HUMONGOUS_REGION_ASSIGN =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_humongous_assign_regions")
                    .help("amount of g1 humongous assign regions")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_ARCHIVE_REGION_BEFORE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_archive_before_collection_regions")
                    .help("amount of g1 archive regions before collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_ARCHIVE_REGION_AFTER =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_archive_after_collection_regions")
                    .help("amount of g1 archive regions after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge G1_ARCHIVE_REGION_ASSIGN =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_g1_archive_assign_regions")
                    .help("amount of g1 archive assign regions")
                    .register(CleanableCollectorRegistry.DEFAULT);
    public static final Summary ZGC_PAUSE_MARK_START_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_pause_mark_start_duration_seconds")
                    .help("zgc pause mark start duration")
                    .register(CleanableCollectorRegistry.DEFAULT);
    public static final Summary ZGC_CONCURRENT_MARK_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_concurrent_mark_duration_seconds")
                    .help("zgc concurrent mark duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary ZGC_CONCURRENT_MARK_FREE_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_concurrent_mark_free_duration_seconds")
                    .help("zgc concurrent mark free duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary ZGC_PAUSE_MARK_END_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_pause_mark_end_duration_seconds")
                    .help("zgc concurrent mark end duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary ZGC_PROCESS_NON_STRONG_REFERENCES_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_process_non_strong_references_duration_seconds")
                    .help("zgc process non-strong references duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary ZGC_CONCURRENT_RESET_RELOCATIONSET_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_concurrent_reset_relocationset_duration_seconds")
                    .help("zgc concurrent reset relocationset duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary ZGC_CONCURRENT_SELECT_RELOCATIONSET_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_concurrent_select_relocationset_duration_seconds")
                    .help("zgc concurrent select relocationset duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary ZGC_PAUSE_RELOCATE_START_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_pause_relocate_start_duration_seconds")
                    .help("zgc pause relocate start duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary ZGC_CONCURRENT_RELOCATE_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_zgc_concurrent_relocate_duration_seconds")
                    .help("zgc concurrent relocate duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_LOAD_1m =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_1m_cpu_load")
                    .help("zgc latest 1 minute cpu load average")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_LOAD_5m =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_5m_cpu_load")
                    .help("zgc latest 5 minute cpu load average")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_LOAD_15m =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_15m_cpu_load")
                    .help("zgc latest 15 minute cpu load average")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MMU_2MS =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_2ms_mmu_ratio")
                    .help("zgc 2ms mmu ratio")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MMU_5MS =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_5ms_mmu_ratio")
                    .help("zgc 5ms mmu ratio")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MMU_10MS =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_10ms_mmu_ratio")
                    .help("zgc 10ms mmu ratio")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MMU_20MS =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_20ms_mmu_ratio")
                    .help("zgc 20ms mmu ratio")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MMU_50MS =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_50ms_mmu_ratio")
                    .help("zgc 50ms mmu ratio")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MMU_100MS =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_100ms_mmu_ratio")
                    .help("zgc 100ms mmu ratio")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MARK_START_USED =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_mark_start_used_bytes")
                    .help("zgc mark start used")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MARK_START_FREE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_mark_start_free_bytes")
                    .help("zgc mark start free")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MARK_END_USED =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_mark_end_used_bytes")
                    .help("zgc mark end used")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MARK_END_FREE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_mark_end_free_bytes")
                    .help("zgc mark end free")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_RELOCATE_START_USED =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_relocate_start_used_bytes")
                    .help("zgc relocate start used")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_RELOCATE_START_FREE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_relocate_start_free_bytes")
                    .help("zgc relocate start free")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_RELOCATE_END_USED =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_relocate_end_used_bytes")
                    .help("zgc relocate end used")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_RELOCATE_END_FREE =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_relocate_end_free_bytes")
                    .help("zgc relocate end free")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_LIVE_MARK_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_live_mark_end_bytes")
                    .help("zgc live mark end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_LIVE_RECLAIM_START =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_live_reclaim_start_bytes")
                    .help("zgc live reclaim start")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_LIVE_RECLAIM_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_live_reclaim_end_bytes")
                    .help("zgc live reclaim end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_ALLOCATED_MARK_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_allocated_mark_end_bytes")
                    .help("zgc allocated mark end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_ALLOCATED_RECLAIM_START =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_allocated_reclaim_start_bytes")
                    .help("zgc allocated reclaim start")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_ALLOCATED_RECLAIM_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_allocated_reclaim_end_bytes")
                    .help("zgc allocated reclaim end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_GARBAGE_MARK_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_garbage_mark_end_bytes")
                    .help("zgc garbage mark end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_GARBAGE_RECLAIM_START =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_garbage_reclaim_start_heap_bytes")
                    .help("zgc garbage reclaim start")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_GARBAGE_RECLAIM_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_garbage_reclaim_end_bytes")
                    .help("zgc garbage reclaim end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_RECLAIMED_RECLAIM_START =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_reclaimed_reclaim_start_bytes")
                    .help("zgc reclaim start")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_RECLAIMED_RECLAIM_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_reclaimed_reclaim_end_bytes")
                    .help("zgc reclaim end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MEMORY_RECLAIM_START =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_memory_reclaim_start_bytes")
                    .help("zgc memory reclaim start")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_MEMORY_RECLAIM_END =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_memory_reclaim_end_bytes")
                    .help("zgc memory reclaim end")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_METASPACE_USED =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_metaspace_used_bytes")
                    .help("metaspace used memory")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_METASPACE_COMMITTED =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_metaspace_committed_bytes")
                    .help("metaspace committed memory")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge ZGC_METASPACE_RESERVED =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_zgc_metaspace_reserved_bytes")
                    .help("metaspace reserved memory")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge SAFEPOINT_TOTAL_NUMBER_OF_APPLICATION_THREADS =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_safepoint_application_threads")
                    .help("amount of application threads")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge SAFEPOINT_INITIALLY_RUNNING =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_safepoint_initially_running_threads")
                    .help("amount of safepoint initially running threads")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge SAFEPOINT_WAITING_TO_BLOCK =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_safepoint_waiting_to_block_threads")
                    .help("amount of safepoint waiting to block threads")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary SAFEPOINT_SPIN_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_safepoint_spin_duration_seconds")
                    .help("safepoint spin duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary SAFEPOINT_BLOCK_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_safepoint_block_duration_seconds")
                    .help("safepoint block duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary SAFEPOINT_SYNC_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_safepoint_sync_duration_seconds")
                    .help("safepoint sync duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary SAFEPOINT_CLEANUP_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_safepoint_cleanup_duration_seconds")
                    .help("safepoint cleanup duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Summary SAFEPOINT_VMOP_DURATION =
            Summary.build()
                    .labelNames("path")
                    .name("jgc_safepoint_vmop_duration_seconds")
                    .help("safepoint vmop duration")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge SURVIVOR_DESIRED_OCCUPANCY_AFTER_COLLECTION =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_survivor_desired_occupancy_after_collection_bytes")
                    .help("survivor occupancy after collection")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge SURVIVOR_CALCULATED_TENURING_THRESHOLD =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_survivor_calculated_tenuring_threshold")
                    .help("survivor threshold to promote tenured generation")
                    .register(CleanableCollectorRegistry.DEFAULT);

    public static final Gauge SURVIVOR_MAX_TENURING_THRESHOLD =
            Gauge.build()
                    .labelNames("path")
                    .name("jgc_survivor_max_tenuring_threshold")
                    .help("survivor max threshold to promote tenured generation")
                    .register(CleanableCollectorRegistry.DEFAULT);
}

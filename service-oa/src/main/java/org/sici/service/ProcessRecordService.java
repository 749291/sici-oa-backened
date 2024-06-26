package org.sici.service;

import org.sici.model.process.ProcessRecord;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 20148
* @description 针对表【oa_process_record(审批记录)】的数据库操作Service
* @createDate 2024-01-30 19:45:08
*/
public interface ProcessRecordService extends IService<ProcessRecord> {
    void record(Long processId, Integer status, String description);
}

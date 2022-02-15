package com.learnjava.strategy.rds;

/**
 * @author admin
 * @description: 策略模式的接口
 * @date 2022/2/159:32
 */
public interface RdsDatabaseService {
    /**
     * 创建数据库
     * @param request
     * @return
     */
    Response create(RdsDatabaseDTO request);

    /**
     *  删除数据库
     * @param request
     * @return
     */
    Response drop(RdsDatabaseDTO request);

    /**
     * 修改数据库备注
     * @param request
     * @return
     */
    Response modifyDatabaseDescription(RdsDatabaseDTO request);

    /**
     * 分页查询实例下的数据库信息
     * @param request
     * @return
     */
    Response list(RdsDatabaseDTO request);

    /**
     * 获取数据库名
     * @param request
     * @return
     */
    public Response getDataBaseNames(RdsDatabaseDTO request);

    /** 查询实例备份设置
     * @param rdsCommonDTO
     * @return
     */
    Response describeBackupPolicy(RdsCommonDTO rdsCommonDTO);

    /**
     *  创建/修改实例备份设置
     * @param backupPolicyDTO
     * @return
     */
    Response modifyBackupPolicy(BackupPolicyDTO backupPolicyDTO);

    /**
     * 备份集列表
     * @param backupDTO
     * @return
     */
    Response describeBackups(RdsInstanceBackupDTO backupDTO);

    /**
     * 创建备份集
     * @param instanceBackupDTO
     * @return
     */
    Response createBackups(InstanceBackupDTO instanceBackupDTO);

    /** 查询数据库、表元数据
     * @param rdsCommonDTO
     * @return
     */
    Response getDatabaseMetadata(RdsCommonDTO rdsCommonDTO);

    /**
     * 数据库恢复到已有实例
     * @param restoreDatabaseDTO
     * @return
     */
    Response restoreDbToExistInstance(RestoreDatabaseDTO restoreDatabaseDTO);

    /**
     * 库/表级别恢复到已有实例
     * @param restoreTableDTO
     * @return
     */
    Response restoreTableToExistInstance(RestoreTableDTO restoreTableDTO);

    /**
     * 获取数据库字符集编码
     * @return
     */
    Response getCharacterSet();

    /**
     * 备份集的还原列表
     * @param restoreDatabaseDTO
     * @return
     */
    Response restoreList(RestoreDatabaseDTO restoreDatabaseDTO);

    /**
     * 删除备份集
     * @param backupDTO
     * @return
     */
    Response delBackup(RdsInstanceBackupDTO backupDTO);

    /**
     * 创建/修改OSS备份设置
     * @param ossBackupConfigDTO
     * @return
     */
    Response createOrUpdateOssBackupConfig(OssBackupConfigDTO ossBackupConfigDTO);

    /**
     * 查询OSS备份设置
     * @param rdsCommonDTO
     * @return
     */
    Response ossBackupConfig(RdsCommonDTO rdsCommonDTO);

    /**
     * 创建OSS备份集(备份启动)
     * @param ossBackup
     * @return
     */
    Response createOssBackup(OssBackup ossBackup);
}

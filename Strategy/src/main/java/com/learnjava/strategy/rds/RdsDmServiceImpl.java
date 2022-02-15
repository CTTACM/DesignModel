package com.learnjava.strategy.rds;

/**
 * @author admin
 * @description: dm数据库实现
 * @date 2022/2/159:42
 */
public class RdsDmServiceImpl implements RdsDatabaseService{
    @Override
    public Response create(RdsDatabaseDTO request) {
        return null;
    }

    @Override
    public Response drop(RdsDatabaseDTO request) {
        return null;
    }

    @Override
    public Response modifyDatabaseDescription(RdsDatabaseDTO request) {
        return null;
    }

    @Override
    public Response list(RdsDatabaseDTO request) {
        return null;
    }

    @Override
    public Response getDataBaseNames(RdsDatabaseDTO request) {
        return null;
    }

    @Override
    public Response describeBackupPolicy(RdsCommonDTO rdsCommonDTO) {
        return null;
    }

    @Override
    public Response modifyBackupPolicy(BackupPolicyDTO backupPolicyDTO) {
        return null;
    }

    @Override
    public Response describeBackups(RdsInstanceBackupDTO backupDTO) {
        return null;
    }

    @Override
    public Response createBackups(InstanceBackupDTO instanceBackupDTO) {
        return null;
    }

    @Override
    public Response getDatabaseMetadata(RdsCommonDTO rdsCommonDTO) {
        return null;
    }

    @Override
    public Response restoreDbToExistInstance(RestoreDatabaseDTO restoreDatabaseDTO) {
        return null;
    }

    @Override
    public Response restoreTableToExistInstance(RestoreTableDTO restoreTableDTO) {
        return null;
    }

    @Override
    public Response getCharacterSet() {
        return null;
    }

    @Override
    public Response restoreList(RestoreDatabaseDTO restoreDatabaseDTO) {
        return null;
    }

    @Override
    public Response delBackup(RdsInstanceBackupDTO backupDTO) {
        return null;
    }

    @Override
    public Response createOrUpdateOssBackupConfig(OssBackupConfigDTO ossBackupConfigDTO) {
        return null;
    }

    @Override
    public Response ossBackupConfig(RdsCommonDTO rdsCommonDTO) {
        return null;
    }

    @Override
    public Response createOssBackup(OssBackup ossBackup) {
        return null;
    }
}

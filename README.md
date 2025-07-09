# diancan_SpringCloud

## 项目简介

本项目为基于 Spring Cloud 微服务架构的餐饮点餐系统，包含用户、商家、商品、订单、支付、购物车、网关等多个服务，支持分布式部署，适合学习和二次开发。

## 技术栈
- JDK 21
- Spring Boot 3.1.x
- Spring Cloud 2022.x
- Spring Cloud Alibaba 2022.x
- MyBatis-Plus 3.5.x
- Nacos、OpenFeign、Gateway、Redis、MySQL
- Vue3 前端（`diancan_vue3` 文件夹）

## 目录结构
```
diancan_SpringCloud/
├── api/                # 微服务API接口定义
├── business-service/   # 商家服务
├── cart-service/       # 购物车服务
├── common/             # 公共模块
├── config-center/      # 配置中心（Nacos配置）
├── food-service/       # 商品服务
├── gateway/            # 网关服务
├── order-service/      # 订单服务
├── pay-service/        # 支付服务
├── user-service/       # 用户服务
├── docker-compose.yml  # 一键部署脚本
├── SQL.sql             # 数据库建表脚本
└── ...
```

## 环境要求
- JDK 21
- Maven 3.8+
- MySQL 5.7/8.0
- Redis 5+
- Nacos 2.x（配置中心）
- Node.js 16+（前端）

## 快速启动
1. **数据库准备**：导入 `SQL.sql` 到本地 MySQL。
2. **配置 Nacos**：启动 Nacos，导入 `config-center` 下的配置文件。
3. **修改配置**：根据实际环境修改各服务下的 `application.yaml` 数据库、Redis、Nacos 地址。
4. **编译项目**：
   ```sh
   mvn clean install
   ```
5. **启动服务**：依次启动各服务的主类（如 `UserApplication.java`、`GatewayApplication.java` 等），或使用 `docker-compose.yml` 一键启动。
6. **启动前端**：进入 `diancan_vue3` 目录，执行：
   ```sh
   npm install
   npm run dev
   ```

## 常见问题
- **依赖冲突/编译失败**：请确保 JDK 版本为 21，Maven 依赖已更新，IDE 缓存已清理。
- **Nacos 连接失败**：检查 Nacos 是否启动，配置文件地址是否正确。
- **数据库连接失败**：检查数据库配置、账号密码、端口是否正确。

 

# Security Review

Review date: 2026-10-01

## Finding

| # | Severity | File | Lines | Vulnerability | Confidence |
|---|----------|------|-------|---------------|------------|
| 1 | 🟡 MEDIUM | `src/main/java/com/training/lab/LabController.java` | 28-31 | The login endpoint authenticates using a hardcoded username and plaintext password. The same training credentials are published in the README, allowing anyone who can reach the endpoint to receive `{"authenticated":true}` as that user. | 10/10 |

### Impact and scope

The issue permits authentication as the hardcoded training user. The reviewed application does not issue sessions or tokens and has no other protected endpoints, so the demonstrated impact is limited to the authentication response.

### Review scope and limitations

The review covered application source, `pom.xml`, the README, and non-log `.github` configuration files. The workspace had no Git metadata. The README describes the application as a local training lab and warns against public deployment.

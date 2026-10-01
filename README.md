# Lab 07: Plaintext password comparison

**Category:** Authentication Failures

## Scenario
This application intentionally contains a small, isolated vulnerability for security training.

## Student objective
1. Run the application.
2. Discover and reproduce the issue.
3. Identify the vulnerable Java code.
4. Explain the security impact.
5. Remediate it without breaking intended behavior.
6. Retest the original attack.
7. Capture before/after evidence and update Jira.

## Vulnerability
@PostMapping("/login")
public Map<String,Object> login(@RequestParam String user, @RequestParam String password) {
    if ("alice".equals(user) && "alice123".equals(password))
        return Map.of("authenticated",true);
    return Map.of("authenticated",false);
}

## Remediation direction
Hash passwords and use a password verifier; add suitable abuse controls.

## Run
Java 17+ and Maven:
```bash
mvn spring-boot:run
```
Then open `http://localhost:8081`.

## Training safety
Local training only. Do not deploy publicly. Use only synthetic data and training credentials.

## Jira
OPEN -> IN PROGRESS -> FIX READY -> SECURITY RETEST -> VERIFIED -> CLOSED
If retest fails: REOPENED.

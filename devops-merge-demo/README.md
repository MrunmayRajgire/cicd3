# DevOps Merge-Conflict Demo

This demo illustrates:

1. How to simulate a merge conflict in `UserService.java`.
2. Resolving conflicts via **merge** vs **rebase**.
3. Running and fixing a failing test.
4. CI/CD validation with GitHub Actions.

## Getting Started

```bash
# Clone and enter project
git clone https://github.com/yourname/devops-merge-demo.git
cd devops-merge-demo

# Create feature branch and introduce a change
git checkout -b feature/rename-method
# Edit UserService.java to rename method
# Change: public String getUserName() {...}
# To:     public String fetchUserName() {...}
git commit -am "Feature: rename getUserName() to fetchUserName()"

# Switch back, create conflicting change
git checkout main
# Edit UserService.java to change returned value to "Bob"
git commit -am "Fix: update getUserName() logic to return 'Bob'"

# Merge feature into main
git merge feature/rename-method
# Resolve conflict using your IDE Git tool (e.g. IntelliJ, VS Code)

# Run tests and push
mvn clean test
git push origin main
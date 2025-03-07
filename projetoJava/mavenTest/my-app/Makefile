# Makefile for Maven commands

# Default goal
.DEFAULT_GOAL := help

# Variables
MVN := mvn
PROJECT_DIR := $(shell pwd)

run:
	$(MVN) exec:java -Dexec.mainClass="com.rangers.app.App"

# Targets
clean: ## Clean the project
	$(MVN) clean

compile: ## Compile the project
	$(MVN) compile

test: ## Run tests
	$(MVN) test

package: ## Package the project
	$(MVN) package

install: ## Install the project
	$(MVN) install

re:
	$(MVN) clean install

clean-dependencies: ## Clean dependencies
	$(MVN) clean dependency:copy-dependencies package

help: ## Display this help
	@echo "Usage: make [target]"
	@echo ""
	@echo "Targets:"
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "  %-15s %s\n", $$1, $$2}'
.PHONY: help install clean package compile test
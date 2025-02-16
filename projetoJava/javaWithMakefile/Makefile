# Diretórios
SRC_DIR = src
BIN_DIR = bin

# Nome do programa
MAIN_CLASS = src.Main
JAR_NAME = MeuProjeto.jar

# Busca todos os arquivos .java no diretório src
SOURCES = $(shell find $(SRC_DIR) -name "*.java")
CLASSES = $(SOURCES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)

# Configurações do compilador Java
JAVAC = javac
JAR = jar
JAVA = java
JAVAC_FLAGS = -d $(BIN_DIR) -cp $(SRC_DIR)

# Compilar o projeto
all: build

build: $(CLASSES)

$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(BIN_DIR)
	$(JAVAC) $(JAVAC_FLAGS) $<

# Executar o projeto
run: build
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

# Criar um JAR executável
jar: build
	$(JAR) cfe $(JAR_NAME) $(MAIN_CLASS) -C $(BIN_DIR) .

# Limpar arquivos compilados
clean:
	rm -rf $(BIN_DIR) $(JAR_NAME)

# Limpar e compilar novamente
rebuild: clean all

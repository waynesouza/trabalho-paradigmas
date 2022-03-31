# Trabalho Prático

## Disciplina
Paradigmas de Linguagens

## Autores
Rafael Augusto Neto  
Wayne Nascimento Souza

## Requisitos
- SWI Prolog ([Link de apoio](https://www.swi-prolog.org/))  
- Java 11 ([Link de apoio](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html))

## Estrutura de pastas
- *backend* -> pasta que armazena toda a parte de *services* e conexão com o Prolog

## Instalação

### Windows

### Linux
Para a instalação no Linux seja executada da maneira correta, basta seguir os passos abaixo.  
Primeiramente, vamos instalar e configurar o Java 11.
```
mkdir -p /opt/jdk 
```
```
curl -sL https://celulaweb.nyc3.cdn.digitaloceanspaces.com/tmp_files/jdk-11.0.12_linux-x64_bin.tar.gz -o /tmp/jdk-11.0.12_linux-x64_bin.tar.gz
```
```
tar -zxf /tmp/jdk-11.0.12_linux-x64_bin.tar.gz -C /opt/jdk
```
```
update-alternatives --install /usr/bin/java java /opt/jdk/jdk-11.0.12/bin/java 100 &> /dev/null
update-alternatives --install /usr/bin/javac javac /opt/jdk/jdk-11.0.12/bin/javac 100 &> /dev/null
```
```
JAVA_HOME="/opt/jdk/jdk-11.0.12"
```
```
echo "JAVA_HOME=\"$JAVA_HOME\"" >> /etc/bash.bashrc
echo "JAVA_HOME=\"$JAVA_HOME\"" >> /etc/profile	
```
```
update-alternatives --config java
```
Agora, após o Java já estar instalado e configurado, vamos instalar o Prolog.
```
sudo apt-get install swi-prolog
```
```
sudo apt-get install swi-prolog-java
```
Tudo pronto, agora basta iniciar a aplicação.
# 🗳️ SimulaUrna

O **SimulaUrna** é um sistema em java puro para simular o funcionamento de uma urna eletrônica no terminal. O projeto foca no processamento de votações para dois cargos executivos: **Governador** e **Presidente**.

Este projeto foi construído com o objetivo de praticar os conceitos fundamentais da linguagem Java, manipulação de entradas do usuário via console e estruturas condicionais.

---

## 📌 Funcionalidades

- **Votação em Etapas:** Processamento sequencial de votos para os cargos de Governador (Estado da Bahia) e Presidente da República.
- **Validação de Candidatos:** Reconhecimento automático do candidato de acordo com o número digitado.
- **Tratamento de Votos Nulos:** Captura automática e indicação de voto nulo para qualquer número que não pertença a um candidato cadastrado.
- **Interface via Terminal:** Mensagens para guiar o eleitor durante o processo.

---

## 💻 Candidatos Cadastrados no Sistema

### 🔰 Governador (Bahia)
| Número | Candidato | Partido |
| :---: | :--- | :--- |
| **13** | Jerônimo Rodrigues | PT |
| **44** | ACM Neto | União Brasil |
| **80** | Aroldo Félix | UP |

### 🔰 Presidente da República
| Número | Candidato | Partido |
| :---: | :--- | :--- |
| **13** | Luiz Inácio Lula da Silva | PT |
| **22** | Flávio Bolsonaro | PL |
| **14** | Renan Santos | Missão |

*Obs: Qualquer outro número digitado para os cargos será contabilizado como **Voto Nulo**.*

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 25 
- **Entrada de Dados:** `java.util.Scanner`
- **Estruturas de Controle:** `if / else`



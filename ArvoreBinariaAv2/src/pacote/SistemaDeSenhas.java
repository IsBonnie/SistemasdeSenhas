package pacote;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeSenhas {
  
        private No raiz;

        public SistemaDeSenhas() {
            raiz = new No();
        }

        public void insereLogin(String senha, String usuario) {
            No atual = raiz;
            for (char c : senha.toCharArray()) {
                if (c == '0') {
                    if (atual.esquerda == null) {
                        atual.esquerda = new No();
                    }
                    atual = atual.esquerda;
                } else if (c == '1') {
                    if (atual.direita == null) {
                        atual.direita = new No();
                    }
                    atual = atual.direita;
                }
            }
            atual.usuario = usuario;
        }

        public boolean removeLogin(String senha) {
            return removeLogin(raiz, senha, 0);
        }

        private boolean removeLogin(No atual, String senha, int depth) {
            if (atual == null) {
                return false;
            }
            if (depth == senha.length()) {
                if (atual.usuario != null) {
                    atual.usuario = null;
                    return true;
                }
                return false;
            }
            char c = senha.charAt(depth);
            if (c == '0') {
                return removeLogin(atual.esquerda, senha, depth + 1);
            } else if (c == '1') {
                return removeLogin(atual.direita, senha, depth + 1);
            }
            return false;
        }

        public boolean validaLogin(String senha, String usuario) {
            No atual = raiz;
            for (char c : senha.toCharArray()) {
                if (c == '0') {
                    atual = atual.esquerda;
                } else if (c == '1') {
                    atual = atual.direita;
                }
                if (atual == null) {
                    return false;
                }
            }
            return usuario.equals(atual.usuario);
        }
        
    }


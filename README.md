# Exercício Introdutório sobre Modelagem Orientada a Objetos

1) Retome a implementação do exercício sobre a modelagem de uma lâmpada e implemente a
abstração de um lustre que contêm diversas lâmpadas e que pode ser ligado e desligado.
Assuma que o número de lâmpadas do lustre deve ser definido através do construtor e que não
pode ser alterado posteriormente.
    a) Inclua um método que retorne verdadeiro caso tenha alguma lâmpada queimada no
lustre, e falso caso contrário.
    b) Inclua um método que retorne uma coleção indicando a posição das lâmpadas
queimada. Você pode assumir que as posições do lustre são numeradas através de
índices 0, 1, 2, etc.
    c) Implemente uma aplicação de console de teste capaz de criar um lustre, ligá-lo e desligálo diversas vezes e verificar se alguma lâmpada queimou durante esse processo,
indicando sua posição.

2) Estamos interessados no desenvolvimento de um sistema para o controle do número de horas
trabalhadas por funcionários de uma empresa. Além disso, também estamos interessados em
um sistema de contabilidade do salário devido a cada funcionário em função do número de
horas trabalhadas.
O sistema deve ser capaz de armazenar informações da entrada e saída do funcionário no início
e fim da jornada diária durante o período de uma semana (considerando uma jornada de
trabalho de 5 dias, sem jornada de trabalho aos sábados e domingos).
Cada funcionário da empresa é identificado por uma sequência única de 5 dígitos. O sistema
contábil da empresa mantém o nome, a data de contratação e o salário-hora de cada
funcionário. Com base no salário-hora e no número de horas trabalhadas, o sistema é capaz de
contabilizar (para cada funcionário):
    • Número de horas trabalhadas por dia;
    • Número de horas trabalhadas na semana;
    • Salário bruto semanal.
   
    a) Projete as classes necessárias. Procure separar corretamente as responsabilidades. Apresente o resultado em um diagrama de classes da UML.
    b) Implemente em Java as classes projetadas no exercício “a”.

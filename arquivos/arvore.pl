% REGRAS
compramos(X) :- gasto(_,X,_,_,_,_,_) , !.
quantos(P,Q) :- findall(X,gasto(_,P,_,X,_,_,_),S) , sumlist(S,Q).

% BASE DE CONHECIMENTO
gasto('01-09-2021','cimento','loja a',20.0,'saco',28.0,560.0).
gasto('02-02-2021','tijolo','loja b',2.0,'unidade',2.0,4.0).

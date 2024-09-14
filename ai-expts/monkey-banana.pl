% Actions
% action(state1, name, state2)
% state(MonkeyHoriz, MonkeyVert, BoxHoriz, BananaHoriz, MonkeyHasBanana)

action(state(MonkeyHoriz, onceiling, BoxHoriz, BananaHoriz, has_not),
       grab,
       state(MonkeyHoriz, onceiling, BoxHoriz, BananaHoriz, has)):- MonkeyHoriz = BananaHoriz.

action(state(MonkeyHoriz, onfloor, BoxHoriz, BananaHoriz, MonkeyHasBanana),
       climb,
       state(MonkeyHoriz, onceiling, BoxHoriz, BananaHoriz, MonkeyHasBanana)):- MonkeyHoriz = BoxHoriz.

action(state(MonkeyHoriz, onfloor, BoxHoriz, BananaHoriz, MonkeyHasBanana),
       push(X),
       state(X, onfloor, X, BananaHoriz, MonkeyHasBanana)):-
       MonkeyHoriz = BoxHoriz.

action(state(_, onfloor, BoxHoriz, BananaHoriz, MonkeyHasBanana),
       walk(X),
       state(X, onfloor, BoxHoriz, BananaHoriz, MonkeyHasBanana)).

can_get_banana(state(_,_,_,_,has)).

can_get_banana(State1):-
       action(State1, _, State2),
       can_get_banana(State2).

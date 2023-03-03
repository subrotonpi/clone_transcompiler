def import sys , random , symbols , numbers , symbols , count , symbol , ** kwargs ) :
    from sympy import symbols
    N = symbols ( 'N' )
    sum = 0
    for x , u in product ( * numbers , repeat = N ) :
        if u == 'BTC' :
            sum += x * 380000
        else :
            sum += x
    print ( sum )

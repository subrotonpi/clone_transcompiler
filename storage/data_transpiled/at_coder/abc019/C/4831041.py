def Main ( ) :
    global n
    global a
    n = int ( n )
    a = _intbitset ( range ( n ) )
    print ( a.count ( ) )
    for i in a :
        while i % 2 == 0 :
            if i in a [ i ] : return False

def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , arg ) :
            self.arg = arg
    N = sys.argv [ 1 ]
    a = [ ]
    for i in range ( 1 , N + 1 ) :
        a.append ( sc.randint ( 1 , N + 1 ) )
    sc = Main ( )
    count = 0
    i = 1
    is_on = [ False ] * N + [ True ]
    while True :
        if a [ i ] == 2 :
            count += 1
            break
        if is_on [ i ] == True :
            count = - 1
            break
        count += 1
        is_on [ i ] = True
        i = a [ i ]
    print ( count )

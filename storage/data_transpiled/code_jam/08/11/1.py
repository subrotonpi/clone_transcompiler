def import readline , tty , rand , choice , tty , rand , choice , tty , rand , choice , tty , eval , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , writewrite , readwrite , readwrite , readwrite , writewrite , readwrite , readwrite , writewrite , readwrite , readwrite , readwrite , writewrite , readwrite , writewrite , writewrite , writewrite , readwrite , writewrite , writewrite , readwrite , writewrite , writewrite , writewrite , writewrite , writewrite , writewrite , writewrite , writewrite , writewrite , ) :
    tests = randint ( 0 , 100000 )
    for test in range ( tests ) :
        n = randint ( 0 , 100000 )
        a = [ randint ( 0 , 100000 ) for _ in range ( n ) ]
        b = [ randint ( 0 , 100000 ) for _ in range ( n ) ]
        a.sort ( key = lambda x : x [ 1 ] )
        b.sort ( key = lambda x : x [ 0 ] )
        b.sort ( key = lambda x : x [ 1 ] )
        col = [ False for _ in range ( n ) ]
        res = min ( res , rec ( i + 1 , a , b , v + a [ i ] * b [ j ] ) )
        col.append ( True )
        res = min ( res , rec ( i + 1 , a , b , v + a [ i ] * b [ j ] ) )
        col.append ( False )
    def run ( ) :
        try :
            stdin , stdout , stderr = readline , rand , rand , rand , rand , choice , tty , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite ,
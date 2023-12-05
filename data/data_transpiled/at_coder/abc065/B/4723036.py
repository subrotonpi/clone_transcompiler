def main ( ) :
    import sys
    from itertools import islice
    from itertools import islice
    f = open ( sys.argv [ 1 ] )
    n = len ( f.readlines ( ) )
    list = [ f.readlines ( ) [ 0 ] for i in range ( 1 , n + 1 ) ]
    islice = islice ( list , n + 1 )
    count = 0
    start = 1
    while 1 :
        if islice ( list , start ) == 0 :
            print ( - 1 )
            return
        islice ( list , start )
        if start == 2 :
            break
        start = list [ start ]
        count += 1
    print ( count )

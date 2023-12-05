def gcj2010r1c.b ; import os , sys , math , math , re , time , sys , sys , sys , stdout , stderr , count , count , ** kwargs ) :
    try :
        if sys.argv [ 1 : ] :
            f = open ( sys.argv [ 1 ] , 'r' )
        else :
            f = sys.stdin
        lines = f.readlines ( )
        case_count = int ( lines [ 0 ] )
        start_time = time.time ( )
        for i in range ( case_count ) :
            lines = lines [ i ]
            nums = lines [ 1 : ]
            l = int ( nums [ 0 ] )
            p = int ( nums [ 1 ] )
            c = int ( nums [ 2 ] )
            print ( 'Case #' , i + 1 , end = ' ' )
            print ( ': ' , end = ' ' )
            print ( count_test ( l , p , c ) , end = ' ' )
        sys.stderr.write ( 'Elasped Time : %s\n' % ( time.time ( ) - start_time ) )
        f.close ( )
    except :
        pass
    def count_test ( l , p , c ) :
        max = ( float ( p ) / float ( l ) )
        ml = math.log ( max ) / math.log ( c )
        result = math.ceil ( math.log ( ml ) / math.log ( 2 ) )
        if result < 0 :
            return 0
        return int ( result )
    return count_test

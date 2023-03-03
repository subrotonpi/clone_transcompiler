def import import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.rck = sys.stdin.readline ( ).split ( ) [ 3 : ]
        R = int ( rck [ 0 ] )
        C = int ( rck [ 1 ] )
        K = int ( rck [ 2 ] )
        N = int ( self.rck [ 0 ] )
        count_per_r = [ 0 ] * ( R + 1 )
        count_per_c = [ 0 ] * ( C + 1 )
        Rs = [ ]
        Cs = [ ]
        for rc in sys.stdin.readline ( ).split ( ) [ 3 : ] :
            r , c = int ( rc [ 0 ] ) , int ( rc [ 1 ] )
            count_per_r [ r ] += 1
            count_per_c [ c ] += 1
            Rs.append ( r )
            Cs.append ( c )
        r_per_count = [ 0 ] * ( N + 1 )
        for i in range ( 1 , R + 1 ) :
            r_per_count [ count_per_r [ i ] ] += 1
        c_per_count = [ 0 ] * ( N + 1 )
        for i in range ( 1 , C + 1 ) :
            c_per_count [ count_per_c [ i ] ] += 1
        result = 0
        for i in range ( 0 , K + 1 ) :
            result += r_per_count [ i ] * c_per_count [ K - i ]
        for r , c in zip ( Rs , Cs ) :
            count = count_per_r [ r ] + count_per_c [ c ]
            if count == K :
                result -= 1
            elif count == K + 1 :
                result += 1
        print ( result )

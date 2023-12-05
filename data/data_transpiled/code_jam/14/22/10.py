def _go ( ind , aa , bb , kk ) :
    import random
    import sys
    class B ( object ) :
        def __init__ ( self , a , b , k ) :
            if not ind :
                return 1
            if self.mem [ ind ] [ aa ] [ bb ] [ kk ] != - 1 :
                return self.mem [ ind ] [ aa ] [ bb ] [ kk ]
            res = 0
            res += self.go ( ind - 1 , ( ~ a >> ind ) & aa , ( ~ b >> ind ) & bb , ( ~ k >> ind ) & kk )
            if aa == 0 or ( a >> ind ) % 2 == 1 :
                res += self.go ( ind - 1 , ( a >> ind ) & aa , ( ~ b >> ind ) & bb , ( ~ k >> ind ) & kk )
            if bb == 0 or ( b >> ind ) % 2 == 1 :
                res += self.go ( ind - 1 , ( ~ a >> ind ) & aa , ( b >> ind ) & bb , ( ~ k >> ind ) & kk )
            if ( aa == 0 or ( a >> ind ) % 2 == 1 ) and ( bb == 0 or ( b >> ind ) % 2 == 1 ) and ( kk == 0 or ( k >> ind ) % 2 == 1 ) :
                res += self.go ( ind - 1 , ( a >> ind ) & aa , ( b >> ind ) & bb , ( k >> ind ) & kk )
            return self.mem [ ind ] [ aa ] [ bb ] [ kk ] = res
    def main ( ) :
        with open ( 'test.txt' , 'r' ) as sc :
            num_tests = sc.read ( ).count ( '#' )
            for test in range ( 1 , num_tests + 1 ) :
                a , b , k = sc.read ( ).split ( '#' )
                a -= 1
                b -= 1
                k -= 1
                mem = [ [ ] for i in range ( 32 ) for j in range ( 2 ) for g in range ( 2 ) ]
                res = self.go ( 31 , 1 , 1 , 1 )
                print ( 'Case #' , test , res )
    return main

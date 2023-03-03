def do_main ( ) :
    import os
    import sys
    class Alphabetomials ( object ) :
        def __init__ ( self ) :
            self.cnt = [ ]
        def pow ( self , a , b ) :
            res = 1
            for i in range ( 1 , b + 1 ) :
                res *= a
            return res
        def getValue ( s ) :
            sum = 0
            for i in range ( len ( self.cnt ) ) :
                for w in self.cnt [ i ] [ w - 'a' ] :
                    sum += 1
            print ( "Case #%d:" % self.caseNum , end = ' ' )
            for k in range ( 1 , K + 1 ) :
                res = 0
                for item in self.cnt [ i ] [ s - 'a' ] :
                    add = ( add * self.cnt [ i ] [ s - 'a' ] ) % 10009
                sum = ( sum + add ) % 10009
            return sum
        def solve ( self , item , k ) :
            mx = pow ( self.k , len ( item ) )
            ind = [ ]
            sum = 0
            for pos in range ( mx ) :
                tmp = pos
                for i in self.cnt [ i ] :
                    ind.append ( tmp % self.cnt [ i ] )
                    tmp /= self.cnt [ i ] [ s ]
                add = 1
                for i in self.cnt [ i ] :
                    if i == j :
                        s += self.cnt [ i ] [ j ]
                    add = ( add * self.getValue ( s ) ) % 10009
                sum = ( sum + add ) % 10009
            return sum
        def solve ( self , item ) :
            mx = pow ( self.cnt , k )
            ind = [ ]
            sum = 0
            for pos in range ( mx ) :
                tmp = pos
                for i in self.cnt [ i ] :
                    ind.append ( tmp % self.cnt [ i ] [ s - 'a' ] )
                    tmp /= self.cnt [ i ] [ s ]
                add = ( add * self.cnt [ i ] [ s - 'a' ] ) % 10009
            return sum
    return
    
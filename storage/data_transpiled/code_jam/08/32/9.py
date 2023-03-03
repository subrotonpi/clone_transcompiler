def _import ( ) :
    from math import pow
    class B ( object ) :
        def __init__ ( self , ten = 10 ) :
            self.ten = pow ( 2 , 3 )
            self.n2 = pow ( 3 , 7 )
            self.n3 = pow ( 5 , 7 )
            self.n5 = pow ( 7 , 7 )
        def __init__ ( self , s ) :
            super ( B , self ).__init__ ( )
            self.s = s
        def rec ( self , idx , r2 , r3 , r5 , r7 ) :
            if idx == len ( s ) :
                return sum ( ( r2 , r3 , r5 , r7 ) )
            if self.memo [ self.idx ] [ r2 ] [ r3 ] [ r5 ] [ r7 ] :
                return self.memo [ self.idx ] [ r2 ] [ r3 ] [ r5 ] [ r7 ]
            ret = 0
            num = 0
            for i in range ( self.idx , len ( s ) ) :
                num = num * ten
                num = num + ord ( s [ i ] ) - ord ( '0' )
                nr2 = ( ( r2 + num % n2 ) + 2 ) % 2
                nr3 = ( ( r3 + num % n3 ) + 3 ) % 3
                nr5 = ( ( r5 + num % n5 ) + 5 ) % 5
                nr7 = ( ( r7 + num % n7 ) + 7 ) % 7
                ret = ret + rec ( self.idx + 1 , nr2 , nr3 , nr5 , nr7 )
                if self.idx > 0 :
                    nr2 = ( ( r2 - num % n2 ) + 2 ) % 2
                    nr3 = ( ( r3 - num % n3 ) + 3 ) % 3
                    nr5 = ( ( r5 - num % n5 ) + 5 ) % 5
                    nr7 = ( ( r7 - num % n7 ) + 7 ) % 7
                    ret = ret + rec ( self.idx + 1 , nr2 , nr3 , nr5 , nr7 )
            return ret
    def solve ( ) :
        with open ( "/dev/tty" ) as f :
            for TC in range ( 1 , len ( s ) ) :
                f.write ( str ( TC ) )
                
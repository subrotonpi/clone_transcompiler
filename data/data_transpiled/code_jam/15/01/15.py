def import import _scanner
class A ( Scanner ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
        self.T = int ( self.T )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: %d\n" % ( i , self.solve ( ) ) )
    def solve ( self ) :
        sc = _scanner.scanner ( )
        S = sc.scanner ( ).next ( )
        ret = 0
        sum = 0
        for i in range ( len ( S ) ) :
            num = S [ i ] - '0'
            if num > 0 and sum < i :
                ret += i - sum
                sum = i
            sum += num
        return ret

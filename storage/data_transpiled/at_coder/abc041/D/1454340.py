def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
        self.scanner = Scanner ( )
    def start ( self ) :
        N , M = self.scan ( )
        link = [ [ False ] * N ]
        for i in range ( M ) :
            x , y = self.scan ( ) [ 0 ] - 1 , self.scan ( ) [ 1 ] - 1
            link [ x , y ] = True
        total = pow ( 2 , N )
        self.result = [ ]
        for i in range ( total ) :
            self.result.append ( count ( i , link ) )
        print ( self.result [ total - 1 ] )
        self.scanner.close ( )
    def pow ( self , x , y ) :
        if not y :
            return 1
        x2 = pow ( x , y // 2 )
        self.result = x2 * x2
        if y % 2 :
            self.result = self.result * x
        return self.result
    def convert ( x ) :
        return '%16s' % int ( x ).replace ( ' ' , '0' )
    def contains ( self , s , i ) :
        s = self.convert ( s )
        return s [ - 1 - i ] == '1'
    def hasLink ( self , v , s , link ) :
        result = False
        for i in range ( len ( self.result ) ) :
            if self.result [ v ] and contains ( self , s , i ) :
                result = True
                break
        return result
    def count ( self , s , link ) :
        if self.result :
            return self.result
        if s == 0 :
            return 1
        result = 0
        s = self.convert ( s )
        for i in range ( len ( self.result ) ) :
            if s [ - 1 - i ] == '1' and not hasLink ( self , s , link ) :
                s2 = list ( s )
                s2.insert ( - 1 , '0' )
                result += count ( int ( s2 [ - 1 ] ) , 2 )
        return result

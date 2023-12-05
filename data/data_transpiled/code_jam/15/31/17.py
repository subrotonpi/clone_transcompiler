def _ ( ) : return ( 'A' , 'B' , 'C' , 'D' )
class A ( object ) :
    def __init__ ( self , * args ) :
        self.args = args
        self.t = args
        for i in range ( self.t ) :
            print ( 'Case #%d: %d' % ( i + 1 , self.testcase ( self ) ) )
    def testcase ( self , sc ) :
        r = self.r
        c = self.c
        w = self.w
        return ( c // w ) * r + ( w - 1 ) + ( c % w == 0 )

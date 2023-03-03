def _ ( ) : return open ( PROBLEM_LETTER + '-small-attempt0.in' , 'r' ).read ( )
class a ( ) :
    STDIO = 0 , 1 , LARGE = 2
    def __init__ ( self , inType = STDIO , outType = LARGE ) :
        self.inType = inType
        self.outType = outType
        self.n , p = self.n , self.p
    def getfile ( self ) :
        if self.outType == SMALL :
            self.out = open ( self.outType + '-small.out' , 'w' )
        elif self.outType == LARGE :
            self.out.write ( 'WRITING TO ' + self.outType + '-large.out' )
            try :
                time.sleep ( 3000 )
            except KeyboardInterrupt :
                pass
            return open ( self.outType + '-large.out' , 'w' ).read ( )
        return open ( self.outType + '-large.out' , 'w' ).read ( )
    def go ( self , leftover , cnt1 , cnt2 , cnt3 ) :
        if self.memo [ leftover ] [ cnt1 ] [ cnt2 ] [ cnt3 ] :
            return self.memo [ leftover ] [ cnt1 ] [ cnt2 ] [ cnt3 ]
    def getfile ( self ) :
        if self.outType != STDIO :
            self.outType = outType
        if self.inType == SMALL :
            return open ( self.outType + '-small-attempt0.in' , 'r' ).read ( )
        elif self.outType == LARGE :
            return open ( self.outType + '-large.in' , 'r' ).read ( )
        return open ( self.outType + '-large.out' , 'w' ).read ( )

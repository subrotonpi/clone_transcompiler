def _import ( ) : return _import ( - 1000 , 1 )
class c :
    def __init__ ( self , num_ , den_ ) :
        self.num = num_
        self.den = den_
        if self.den < 0 :
            self.num = - self.num
            self.den = - self.den
    def __mul__ ( self , p , v ) :
        if not self.fix [ self.num ] and not self.possib [ self.num ] :
            self.possib [ self.num ] = True
        else :
            raise Exception ( "Unexpected" )
    def __mul__ ( self , p , v ) :
        self.possib [ self.num ] = True
        self.fix [ self.num ] = True
        self.possib [ self.den ] = True
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.den ] = True
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.den ] = True
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.den ] = True
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.den ] = False
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.den ] = True
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.den ] = True
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.den ] = True
    def __mul__ ( self , p , s ) :
        self.possib [ self.num ] = True
        self.possib [ self.num ] = True
    return __mul__
    
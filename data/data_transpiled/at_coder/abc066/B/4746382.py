def _import ( ) : return 33 <= c <= 126
def skip_unprintable ( ) : return has_next_byte ( )
def __next__ ( ) : return int ( next ( ) )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._import ( )
    def solve ( self ) :
        try :
            self._solve ( )
        finally :
            if self._solve ( ) :
                self._solve ( )
    def __next__ ( self ) :
        try :
            self._solve ( )
        finally :
            if self._solve ( ) :
                self._solve ( )
    def __next__ ( self ) :
        try :
            self._solve ( )
        finally :
            if self._solve ( ) :
                self._solve ( )
    def __next__ ( self ) :
        try :
            self._solve ( )
        finally :
            if self._solve ( ) :
                self._solve ( )
    def solve_a ( self ) :
        wk = int_to_int ( self.__next__ ( ) )
        wk.sort ( )
        self._solve ( )
    def solve_b ( self ) :
        s = next ( )
        wks = s [ : - 1 ]
        for i in range ( len ( wks ) // 2 , 0 , - 1 ) :
            tmp = wks [ : i ]
            tmp2 = wks [ i : i * 2 ]
            if tmp == tmp2 :
                self._solve ( )
                return i * 2
    def solve_c ( self ) :
        num_n = self.__next__ ( )
        self._solve ( )
        self._solve ( )
        self._solve ( )
    def solve_d ( self ) :
        num_n = self.__next__ ( )
        self._solve ( )
        self._solve ( )
        self._solve ( )
    def solve_e ( self ) :
        num_n = self.__next__ ( )
        self._solve ( )
        self._solve ( )

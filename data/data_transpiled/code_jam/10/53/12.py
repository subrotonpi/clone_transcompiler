def _import ( ) : return os.path.join ( os.path.dirname ( __file__ ) , '..' , '..' , '..' )
class C ( object ) :
    PROBLEM_ID = 'C'
class TestCaseRunner ( object ) :
    def __init__ ( self , p , v ) :
        self.p = p
        self.v = v
    def __test ( self , that ) :
        self.seconds_per_test = 1.0e-3 * ( self.p - self.start_time ) / self.p
        self.minutes_remaining = self.v / 60
        self.minutes = int ( math.floor ( self.minutes_remaining ) )
        self.seconds = int ( round ( self.seconds - self.minutes * 60 ) )
        return "%d min %d sec" % ( self.minutes , self.seconds )
    def __test ( self , that ) :
        while not self.__test ( ) :
            line = self.__test ( )
            if line is None :
                return None
            self.__test = line
        return 0
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return int ( self.__test ( ) )
    def __test ( self ) :
        return __test

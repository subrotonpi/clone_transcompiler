def _import ( x , y ) : return abs ( x - y ) < EPS
class Main ( Point ) :
    def __init__ ( self , x , y ) :
        super ( Main , self ).__init__ ( )
        self.x = x
        self.y = y
    def dot ( self , p ) :
        return self.x * p.x + self.y
    def _dot ( self , p ) :
        return self.x * p.x + self.y
    def _distance ( self , x ) :
        return self.x * x + self.y
    def _multiply ( self , x ) :
        return self.x * x + self.y
    def _multiply ( self , k ) :
        return self.x * k + self.y
    def _multiply ( self , x ) :
        return self.x * x - self.y
    def _subtract ( self , obj ) :
        if self.obj is None : return False
        if self.__class__ is not obj : return False
        if self._distance ( self , x ) < EPS : return False
        if self._distance ( self , x ) < EPS : return False
        if self._distance ( self , x ) < EPS : return False
        return self._distance ( self , x )
    def __next__ ( self ) :
        try :
            while not self._distance ( self.x ) :
                self._distance ( self , x )
        except AttributeError :
            raise
        return __next__
    def main_loop ( self ) :
        for i in range ( self.n ) :
            if i == j : continue
            q = self._distance ( self , x )
            qp = q - self._distance ( self , y )
            split_line = qp * ( 0 , - 1 )
            if not self._distance ( self , x ) :
                return 0
            return self._distance ( self , x )

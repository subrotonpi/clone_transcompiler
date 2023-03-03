def import _Solve
class Main ( object ) :
    def __init__ ( self ) :
        self.R = 0
        self.B = 0
        self.aka_hon = 0
        self.ao_hon = 0
        self.dekiru_max = max ( R , B )
        min = 0
        mid = ( min + self.dekiru_max ) // 2
        while self.dekiru_max > 1 + min :
            self.dekiru = False
            mid = ( min + self.dekiru_max ) // 2
            dekiru = _Solve ( R , B , self.aka_hon , self.ao_hon , mid )
            if dekiru is True :
                min = mid
            elif dekiru is False :
                self.dekiru_max = mid
        print ( ( min + self.dekiru_max ) // 2 )
    def Solve ( self , a , b , c , d , wa ) :
        aka = a - wa
        ao = b - wa
        po = aka / ( c - 1 ) + ao / ( d - 1 )
        return aka >= 0 and ao >= 0 and po >= wa

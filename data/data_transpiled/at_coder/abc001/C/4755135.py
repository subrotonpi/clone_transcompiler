def import import math
import sys
import decimal
class Main ( object ) :
    def __init__ ( self ) :
        with open ( self.filename ) as sc :
            for line in sc :
                Deg = float ( line.split ( ) [ 0 ] )
                tmp_dif = decimal.Decimal ( float ( line.split ( ) [ 1 ] ) )
                a = decimal.Decimal ( 60 )
                tmp_dif = tmp_dif / a
                Dis = tmp_dif.quantize ( decimal.Decimal ( '.' ) )
    def __init__ ( self ) :
        self.W = 12
        Dir = ''
        self.vec = [ ]
        vec_name = [ 'NNE' , 'NE' , 'ENE' , 'E' , 'ESE' , 'SE' , 'SSE' , 'S' , 'SSW' , 'SW' , 'WSW' , 'W' , 'WNW' , 'NW' , 'NNW' , 'N' ]
        for i in range ( 15 ) :
            if Deg < 112.5 or Deg > 112.5 + 225 * 15 :
                Dir = 'N'
                break
            elif Deg >= 112.5 + ( 225 * i ) and Deg < 112.5 + 225 * ( i + 1 ) :
                Dir = vec_name [ i ]
                break
        power = [ 0.3f , 1.6f , 3.4f , 5.5f , 8.0f , 10.8f , 13.9f , 17.2f , 20.8f , 24.5f , 28.5f , 32.7f ]
        for i in range ( 12 ) :
            if Dis < power [ 0 ] :
                self.W = 0
                Dir = 'C'
                break
            elif Dis >= power [ 11 ] :
                self.W = 12
                break
            elif Dis >= power [ i ] and Dis < power [ i + 1 ] :
                self.W = i + 1
                break
        print ( '{} {}'.format ( self.Dir , str ( self.W ) ) )

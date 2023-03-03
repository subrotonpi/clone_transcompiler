def import _readline
import sys
import readline
import readline
import sys
class Main ( readline ) :
    def __next__ ( self ) :
        return int ( self.__next__ ( ) )
    def __next__ ( self ) :
        return float ( self.__next__ ( ) )
    def __next__ ( self ) :
        return int ( self.__next__ ( ) )
    def __next__ ( self ) :
        return int ( self.__next__ ( ) )
    def __next__ ( self ) :
        return float ( self.__next__ ( ) )
    def __next__ ( self ) :
        sc = readline
        n = sc.__next__ ( )
        dss = [ ]
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                dss [ i ].append ( sc.__next__ ( ) )
        q = sc.__next__ ( )
        ps = [ sc.__next__ ( ) for i in range ( q ) ]
        self.solve ( )
    def __next__ ( self ) :
        sumss = [ ]
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                sumss [ i ].append ( sumss [ i - 1 ] [ j ] + sumss [ i ] [ j - 1 ] - sumss [ i - 1 ] [ j - 1 ] + dss [ i ] [ j ] )
        ans = [ ]
        for i in range ( 1 , len ( ans ) ) :
            for j in range ( i , n + 1 ) :
                for k in range ( 1 , n + 1 ) :
                    for l in range ( k , n + 1 ) :
                        area = ( l - k + 1 ) * ( j - i + 1 )
                        sum = sumss [ j ] [ l ] - sumss [ i - 1 ] [ l ] - sumss [ j ] [ k - 1 ] + sumss [ i - 1 ] [ k - 1 ]
                        ans.append ( max ( ans [ area ] , sum ) )
        for i in range ( 1 , len ( ans ) ) :
            ans.append ( ans [ i ] )

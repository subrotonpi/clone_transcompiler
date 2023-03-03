def world2015.round2 ( ) :
    import os
    import sys
    import os
    import sys
    import csv
    import csv
    class KiddiePool :
        def solve ( self , N , V , X , R , C ) :
            upper , lower = False , False
            for i in range ( N ) :
                tokens = line.split ( ' ' )
                N , X = int ( tokens [ 0 ] ) , float ( tokens [ 2 ] )
            if not ( upper and lower ) :
                return - 1.0
    def main ( args ) :
        input_path = "file/world2015/round2/B-large.in"
        output_path = os.path.split ( input_path ) [ 0 ] + ".out"
        f = open ( output_path , 'w' )
        lines = [ ]
        for i in range ( N ) :
            tokens = line.split ( ' ' )
            N , X = int ( tokens [ 0 ] ) , float ( tokens [ 1 ] )
        for i in range ( N ) :
            wss.append ( WaterSource ( i , R [ i ] , C [ i ] ) )
        wss.sort ( )
        for i in range ( N - 1 ) :
            if wss [ i ].C == wss [ i + 1 ].C :
                wss [ i + 1 ].R += wss [ i ].R
                wss [ i ].R = 0
            left , right = 0.0 , 1000000000.0
            for i in range ( 10000 ) :
                mid = ( left + right ) / 2.0
                if possible ( N , V , X , wss , mid ) :
                    right = mid
                else :
                    left = mid
            return left
    def possible ( N , V , X , wss , t ) :
        min = 0.0
        v = V
        idx = 0
        while idx < len ( wss ) and v > 0.0 :
            if t * wss [ idx ].R <= v :
                min += t * wss [ idx ].R * wss [ idx ].C
                v -= t * wss [ idx ].R
            else :
                min += v * wss [ idx ].C
                v = 0.0
            idx -= 1
        if v > 0.0 : return False
    return Kid@@
def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.outputs = [ 'Do' , 'Re' , 'Mi' , 'Fa' , 'So' , 'La' , 'Si' ]
            self.input = self.input [ : 12 ]
    colors = 'WBWBWWBWBWBW'
    for i in range ( 7 ) :
        if colors == i :
            print ( outputs [ i ] )
            return
        while True :
            colors = colors [ 1 : 12 ] + colors [ 0 ]
            if colors [ 0 ] == 'B' :
                break

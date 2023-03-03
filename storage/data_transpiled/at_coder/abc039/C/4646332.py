def import _float
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = _float ( )
        self.data = sc.data
        self.pattern = 'WBWBWWBWBWBW'
        self.notes = ( 'Do' , '' , 'Re' , '' , 'Mi' , 'Fa' , '' , 'So' , '' , 'La' , '' , 'Si' )
        self.position = - 1
        for i , tmp in enumerate ( self.data ) :
            comp = self.pattern [ : min ( len ( tmp ) , len ( self.pattern ) ) ]
            if tmp.startswith ( comp ) :
                self.position = i
                break
        posi = ( len ( self.notes ) - ( position % len ( self.notes ) ) ) % len ( self.notes )
        print ( self.notes [ posi ] )

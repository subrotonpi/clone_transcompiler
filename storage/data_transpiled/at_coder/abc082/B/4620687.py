def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.g = True
        self.t = 0
        a = sys.stdin.readline ( )
        b = sys.stdin.readline ( )
        str_array_1 = a.split ( '' )
        str_array_2 = b.split ( '' )
        str_array_1 = [ str ( i ) for i in str_array_1 ]
        str_array_2 = [ str ( i ) for i in str_array_2 ]
    def __str__ ( self ) :
        m1 = len ( self.str_array_1 )
        m2 = len ( self.str_array_2 )
        if m1 > m2 :
            m1 = m2
        for i in range ( m1 ) :
            if self.str_array_1 [ i ] < self.str_array_2 [ i ] :
                g = False
                break
            if self.str_array_1 [ i ] == self.str_array_2 [ i ] :
                self.t += 1
        if self.t == m1 and self.m1 < m2 :
            self.print ( 'Yes' )
        elif self.g :
            self.print ( 'No' )
        elif not self.g :
            self.print ( 'Yes' )

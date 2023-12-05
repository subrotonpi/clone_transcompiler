def win32text ( ) : return
import cldr.ha.format_data_ha
import win32text
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
import win32text.client
class Main ( ) :
    def __init__ ( self , X , Y ) :
        self.X = X
        self.Y = Y
        print ( self.solve ( ) )
    def solve ( self ) :
        if self.Y > 0 :
            if self.Y < X :
                return self.X - self.Y + 2
            elif 0 <= X <= Y :
                return self.Y - self.X
            elif - Y < X < 0 :
                return self.Y - abs ( X ) + 1
            else :
                return abs ( X ) - self.Y + 1
        elif self.Y < 0 :
            if self.X <= Y :
                return abs ( X ) - abs ( Y )
            elif self.X < 0 :
                return abs ( Y ) - abs ( X ) + 2
            elif self.X <= - Y :
                return abs ( Y ) - abs ( X ) + 1
            else :
                return abs ( X ) - abs ( Y ) + 1
        else :
            if self.X > 0 :
                return 1 + X
            else :
                return - X
    def min ( self , * args ) :
        min = int ( self.X )
        for value in args :
            min = min ( value , min )
        return min
    from win32text.client import Client
    class Ha ( win32text.client ) :
        def __init__ ( self , * args ) :
            client = Client ( )
            self.X = X
            self.Y = Y
            self.print ( self.solve ( ) )
    return Ha

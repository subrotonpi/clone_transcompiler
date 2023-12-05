def import sys , string , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string
        self.t = string
        self.ss = s.split ( '' )
        self.tt = t.split ( '' )
        x = 0
        l = len ( self.ss )
        e = True
        self.ss = [ s ]
        self.tt = [ t ]
        if len ( self.ss ) > len ( self.tt ) :
            l = len ( self.tt )
        for i in range ( l ) :
            if self.ss [ i ] != self.tt [ i ] :
                e = False
                x = i
                break
        if self.ss < self.tt and e is True :
            print ( 'Yes' )
        elif self.ss >= self.tt and e is True :
            print ( 'No' )
        elif e is False and self.ss [ x ] < self.tt [ x ] :
            print ( 'Yes' )
        else :
            print ( 'No' )
        self.s = s
        self.t = t

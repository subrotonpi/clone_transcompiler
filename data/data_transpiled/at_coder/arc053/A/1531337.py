def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self , * args ) :
        with open ( self.sys ) as sc :
            H = sc.read ( )
            W = sc.read ( )
        if W > H :
            temp = H
            H = W
            W = temp
        if W == 1 and H == 1 :
            print ( 0 )
            return
        if W == 1 and H >= 2 :
            print ( H - 1 )
            return
        if W >= 2 and H >= 2 :
            print ( ( W - 1 ) * H + ( H - 1 ) * W )
            return

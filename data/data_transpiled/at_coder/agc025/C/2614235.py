def main ( ) :
    import sys
    import time
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            self.baseTime = 0
            self.nowTime = 0
        def solve ( self , left , right ) :
            self.left = left
            self.right = right
            self.list = [ ]
            self.list2 = [ ]
            for i in range ( self.N ) :
                range = ( self.LR [ i ] [ 0 ] , self.LR [ i ] [ 1 ] )
                self.list.append ( range )
                self.list2.append ( range )
            sum1 = self.game ( self.list , self.list2 , True )
            self.list = [ ]
            self.list2 = [ ]
            for i in range ( self.N ) :
                range = ( self.LR [ i ] [ 0 ] , self.LR [ i ] [ 1 ] )
                self.list.append ( range )
                self.list2.append ( range )
            sum2 = self.game ( self.list , self.list2 , False )
            print ( max ( sum1 , sum2 ) )
        def main ( self ) :
            return Main ( self )
        def game ( self , list , list2 , toright ) :
            self.list.sort ( lambda a , b : b.left - a.left )
            self.list2.sort ( lambda a , b : a.right - b.right )
            base = sum = 0
            loop :
            while not self.list :
                if toright :
                    while self.list [ 0 ].used :
                        self.list.pop ( 0 )
                        if not self.list :
                            break loop
                    nextBase = self.list [ 0 ].left
                    distance = nextBase - base
                    self.list [ 0 ].used = True
                    self.list.pop ( 0 )
                else :
                    while self.list2 [ 0 ].used :
                        list2.pop ( 0 )
            return sum
    return Main ( )

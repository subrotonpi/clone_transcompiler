def import import sys , string , traceback
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( '/proc/sys/exit.txt' ) as f :
                super ( Main , self ).__init__ ( )
        except IOError :
            print ( 'Could not open /proc/sys/exit.txt' )
            return
    def solve ( self , sc ) :
        a , b , c , d , e , f = map ( int , sys.stdin.read ( ).split ( ) )
        self.waterX = 0
        self.ansWater = 100
        self.ansSugar = 0
        while 100 * a * self.waterX <= f :
            self.waterY = 0
            while 100 * a * self.waterX + 100 * b * self.waterY <= f :
                water = 100 * a * self.waterX + 100 * b * self.waterY
                self.sugarX = 0
                while water + c * self.sugarX <= f :
                    self.sugarY = 0
                    while water + c * self.sugarX + d * self.sugarY <= f :
                        sugar = c * self.sugarX + d * self.sugarY
                        if sugar * ( 100 + e ) <= e * ( self.water + self.sugar ) :
                            if sugar * ( self.ansWater + self.ansSugar ) >= self.ansSugar * ( self.water + self.sugar ) :
                                self.ansWater = water
                                self.ansSugar = sugar
                        self.sugarY += 1
                    self.waterY += 1
                self.waterX += 1
            self.waterY += 1
        self.print ( self.ansWater + self.ansSugar , self.ansSugar )

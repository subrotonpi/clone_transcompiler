def _import ( ) :
    import math
    import os
    import os
    import math
    class Swatter ( object ) :
        def __init__ ( self ) :
            self.start = time.time ( )
            f = open ( 'input.txt' , 'r' )
            w = open ( 'output.txt' , 'w' )
            tests = int ( f.readline ( ) )
            for i in range ( tests ) :
                s = f.readline ( ).split ( )
                f = float ( s [ 0 ] )
                R = float ( s [ 1 ] )
                t = float ( s [ 2 ] )
                r = float ( s [ 3 ] )
                g = float ( s [ 4 ] )
                circle = math.pi * R ** 2
                empty = 0
                gg = g - 2 * f
                if gg > 0 :
                    x0 = r + f
                    RR = R - t - f
                    while x0 < RR :
                        x1 = x0 + gg
                        x0y = math.sqrt ( RR * RR - x0 ** 2 )
                        x1y = math.sqrt ( RR * RR - x1 ** 2 )
                        y0 = r + f
                        while y0 < x0y :
                            y1 = y0 + gg
                            y0x = math.sqrt ( RR * RR - y0 ** 2 )
                            y1x = math.sqrt ( RR * RR - y1 ** 2 )
                            if x1 < y1x and y1 < x1y :
                                empty += gg ** 2
                            elif x1 > y0x and y1 > x0y :
                                dx = y0x - x0
                                dy = x0y - y0
                                ch = math.sqrt ( dx ** 2 + dy ** 2 )
                                a = math.asin ( ch / 2 / RR ) ** 2
                                seg = RR * RR / 2 * ( a - math.sin ( a ) )
                                empty += dx ** 2 + dy ** 2
                            elif y1 > x0y :
                                dx = x1 - x0
                                dy = x0y - x1y
                                ch = math.sqrt ( dx ** 2 + dy ** 2 )
                                a = math.asin ( ch / 2 / RR ) ** 2
                                seg = RR * RR / 2 * ( a - math.sin ( a ) )
                                empty += dx ** 2 + dy ** 2
                            else :
                                print ( "No line found" )
        
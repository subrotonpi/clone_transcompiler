def import re
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( )
        b = sc.readline ( )
        c = None
        list = [ ]
        list2 = [ ]
        for i in range ( len ( a ) ) :
            list.append ( str ( a [ i ] ) )
            list2.append ( str ( b [ i ] ) )
        atc = '[a|t|c|o|d|e|r]'
        bl = False
        for i in range ( len ( a ) ) :
            if bl is True or i == 0 :
                if a [ i ] == list2 [ i ] :
                    bl = True
                elif a [ i ] == '@' :
                    bl = re.match ( atc , list2 [ i ] )
                elif list2 [ i ] == '@' :
                    bl = re.match ( atc , list [ i ] )
                else :
                    bl = False
            else :
                break
        if bl is True :
            c = 'You can win'
        else :
            c = 'You will lose'
        print ( c )
        sys.stdout.flush ( )
        sc.close ( )

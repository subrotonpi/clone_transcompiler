def main ( ) :
    import sys
    import re
    try :
        s = open ( '/etc/init.d/' ).read ( )
    except :
        print ( "Error: %s" % sys.exc_info ( ) [ 0 ] )
        return 1
    ss = [ ]
    ss = s.split ( '' )
    countA = 0
    countB = 0
    countC = 0
    countD = 0
    countE = 0
    countF = 0
    for i in ss :
        if 'A' in i : countA += 1
        elif 'B' in i : countB += 1
        elif 'C' in i : countC += 1
        elif 'D' in i : countD += 1
        elif 'E' in i : countE += 1
        elif 'F' in i : countF += 1
    print ( countA , countB , countC , countD , countE , countF )

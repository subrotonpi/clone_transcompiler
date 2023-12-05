def main ( ) :
    import re
    global S
    global SList
    global maxlength
    sc = open ( "/proc/stations/" , "r" )
    S = sc.read ( )
    SList = [ s for s in S.split ( "\n" ) if re.match ( "(A|C|G|T)*" , s ) ]
    maxlength = 0
    length = 0
    for s in SList :
        if re.match ( "(A|C|G|T)*" , s ) :
            length += 1
            if maxlength < length :
                maxlength = length
        else :
            length = 0
            continue
    print ( maxlength )

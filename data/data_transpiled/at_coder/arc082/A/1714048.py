def import import sys , stdin , set_dict , set_dict , max = 0 , ) :
    import sys
    import os
    import getopt
    try :
        in1 = stdin.readline ( )
    except :
        sys.exit ( 0 )
    try :
        in2 = stdin.readline ( )
    except :
        sys.exit ( 0 )
    for x in in2 :
        key = int ( x )
        set_dict ( key , 0 )
        set_dict ( key , + 1 )
        set_dict ( key , - 1 )
    print ( max )
    def set_dict ( key , num ) :
        key2 = key + num
        val = 0
        if key in set_dict :
            val = set_dict [ key ]
        val += 1
        set_dict [ key2 ] = val
        if val > max :
            max = val
    return set_dict , in1 , in2

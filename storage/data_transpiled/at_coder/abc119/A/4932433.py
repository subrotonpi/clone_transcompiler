def main ( ) :
    import datetime
    import time
    import datetime
    import os
    import sys
    from time import strptime
    from time import strptime
    from os import environ
    S = environ [ 'S' ]
    dt = strptime ( S , '%Y/%m/%d' )
    reiwa = datetime ( 2019 , 5 , 1 )
    d = strptime ( S , dt )
    if d < reiwa :
        print ( 'Heisei' )
    else :
        print ( 'TBD' )

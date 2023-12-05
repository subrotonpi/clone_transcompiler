def import datetime
import dateutil
import dateutil
import dateutil
import dateutil
import dateutil
import dateutil
import dateutil
import dateutil
import dateutil.parser
import dateutil.parser
import dateutil.parser
import dateutil.parser
import dateutil.parser
import dateutil.parser
import dateutil.parser
debug = False
debug2 = False
f = open ( '/dev/null' , 'r' )
date = dateutil.parser.parse ( f.read ( ).decode ( 'utf-8' ) + 'T00:00:00Z' )
while True :
    if date.year % date.month == 0 and date.year / date.month % date.day == 0 :
        print ( date.strftime ( '%Y-%m-%d' ).decode ( 'utf-8' ) )
        break
    date = date + datetime.timedelta ( days = 1 )

/*
 *  ---------
 * |.##> <##.|  Open Smart Card Development Platform (www.openscdp.org)
 * |#       #|  
 * |#       #|  Copyright (c) 1999-2011 CardContact Software & System Consulting
 * |'##> <##'|  Andreas Schwier, 32429 Minden, Germany (www.cardcontact.de)
 *  --------- 
 *
 *  This file is part of OpenSCDP.
 *
 *  OpenSCDP is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License version 2 as
 *  published by the Free Software Foundation.
 *
 *  OpenSCDP is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with OpenSCDP; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package opencard.core.terminal;


/**
 * The <tt>ExtendedVerifiedAPDUInterface</tt> extends the <tt>VerifiedAPDUInterface</tt>. <br>
 * A <tt>CardTerminal</tt> that implements the <tt>ExtendedVerifiedAPDUInterface</tt> 
 * can do PIN verification with class 1 and class 3 card reader.
 */
public interface ExtendedVerifiedAPDUInterface extends VerifiedAPDUInterface {
	  

	public boolean hasSendVerifiedCommandAPDU();
}

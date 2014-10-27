/**
 * Contiene las clases que permiten acceder al sistema de persistencia de la agenda.
 * Implementa dos formas de persistencia, una basada en persistencia de base de datos y otra 
 * basada en persistencia de flujos de ficheros binarios.
 * Permite configurar al cliente con uno de los dos subsistemas sin que tenga dependencias 
 * sobre las implementaciones concretas. 
 * El cliente usa una propiedad de la aplicación para seleccionar la implementación concreta.
 */
/**
 * @author Carlos López
 *
 */
package ubu.lsi.dms.agenda.persistencia;